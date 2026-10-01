import './App.css'
import Greetings from './Greetings'
import Person from './Person'

function App() {


  return (
    <div>
      <Greetings person={{name:"vishnu", age:35 ,profession:"trainer"}}/><hr/>
      <Greetings person={{name:"vijay", age:45, profession:"Software Developer"}}/>
    </div>
  )
}

export default App
