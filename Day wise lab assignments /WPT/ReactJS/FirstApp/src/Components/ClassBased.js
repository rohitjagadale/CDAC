import React from "react";


class ClassBased extends React.Component{
constructor(props){
    super();
    this.state={
        name:props.name
    }
}

    render(){
        return (<div className="App-header1">
            <h4>This is ClassBased componenet stateFull and Name with props is {this.props.name}</h4>
        </div>);
    }
}

export default ClassBased;