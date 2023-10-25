package tester;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static utils.BankValidationRules.parseAndValidateDate;

import com.app.bank.BankStatement;

public class TestBankStatements {

	public static void main(String[] args) {
		String file = "E:\\CDAC_SEP2023_MAIN\\Modules\\OOPS_With_Java\\Practice_2023\\lab_exam_practice3\\src\\file\\Jan2023.txt";
		try(Scanner sc = new Scanner(System.in); BufferedReader br = new BufferedReader(new FileReader(file))){
			List<BankStatement> statementList = br.lines().skip(1).map(l->{
				try(Scanner fsc = new Scanner(l)){
					fsc.useDelimiter(",");
					return new BankStatement(parseAndValidateDate(fsc.next()), fsc.next(), fsc.nextDouble(), fsc.nextDouble());
					
				}
			}).collect(Collectors.toList());
			boolean exit = false;
			while(!exit) {
				System.out.println("Enter Options :\n"+"1. Sum of all deposits\n"
						+ "2. Max deposit amount\n"
						+ "3. Shopping expenses (sum of withdrawals for shopping)\n"
						+ "4. Date on which maximum amount withdrawn\n"+"5. Exit\n");
				try {
					switch(sc.nextInt()) {
					case 1://Sum of all deposits
						double sum  = 0;
						for(BankStatement b:statementList ) {
							sum += b.getDepositAmount();
						}
						System.out.println("Sum of all deposits = "+sum);
						break;
						
					case 2://Max deposit amount
						double maxAmount = statementList
						.stream()
						.map(s1 -> s1.getDepositAmount())
						.max((p1,p2)->p1.compareTo(p2)).orElseThrow();
						System.out.println("Max deposit amount = "+maxAmount);
						
						//double maxAmount = statementList.stream().mapToDouble((s1)->s1.getDepositAmount()).max().orElseThrow();
					    break;
					    
					case 3://Shopping expenses (sum of withdrawals for shopping)
						double shopAmount = statementList.stream().filter(p1->p1.getNarration().equalsIgnoreCase("Shopping"))
						                    .mapToDouble(a1->a1.getWithdrawalAmount()).sum();
						System.out.println("Shopping expenses (sum of withdrawals for shopping) = "+shopAmount);
						break;
						
					case 4://Date on which maximum amount withdrawn
						//double maxAmount = statementList.stream().mapToDouble((s1)->s1.getDepositAmount()).max().orElseThrow();
						Collections.sort(statementList, (a1,a2)->(((Double)a2.getWithdrawalAmount()).compareTo(a1.getWithdrawalAmount())));
						for(BankStatement b1:statementList) {
							System.out.println("Max deposit amount = "+b1.getTransactionDate());
							break;
						}
						
						break;
					case 5://Exit
						exit = true;
						System.out.println("Exit!!!!");
						break;
					}
				}catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
				
			}
			
		}catch (FileNotFoundException f) {
			f.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
