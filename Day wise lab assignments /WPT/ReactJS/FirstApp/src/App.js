
import './App.css';
import Footer from './Components/Footer';
import ClassBased from './Components/ClassBased.js';
import FunctionBased from './Components/FunctionBased';
import NewMessage from './Components/NewMessage.jsx';
function App() {
  return (
    <div className="App">
        
    <h1>Hello World !!</h1>
    <h4>This is First applicaation not Last</h4>
    <NewMessage></NewMessage>
    <ClassBased name="class456" />
          <FunctionBased name="Function123"/>
      
          <Footer/>
    </div>
  );
}

export default App;
