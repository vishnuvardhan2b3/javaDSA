import Greetings from "./Greetings"
import Messenger from "./Messenger"
import StopWatch from "./StopWatch"

function App() {
   return <div>
            <StopWatch/>
            <Messenger name="Heyansh" isOnline={true} isPremium={true}/>
            <Messenger name="Arun" isOnline={false} isPremium={false}/>
          </div>
}

export default App
