import Person from "./Person";

function Greetings({person}){
    
    return <h1>Hello <Person person={{...person}}/></h1>
             
}
export default Greetings;