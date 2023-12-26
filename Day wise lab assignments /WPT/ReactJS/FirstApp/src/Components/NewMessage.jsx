import { Component } from "react";

class NewMessage extends Component{
    constructor(props){
        super();
        this.state={mesg:"This is initial mesg"
            
        }
    }
    NewMessage=()=>{
       this.setState({mesg:"This is New Message"})
;    }

    render(){
        return(
        <div>
            <h1>Enter Text: <input type="text" name="text1" id="text1" value={this.state.name} onChange={(event)=>this.setState({name:event.target.value})}/></h1>
        <h1>{this.state.mesg}</h1>
        <h1>This is Test data : {this.state.name}</h1>
        <h1><button type="button" name="btn" value="click" onClick={()=>this.NewMessage()}>Get New Message</button></h1>
        </div>)
    };
}


export default NewMessage;