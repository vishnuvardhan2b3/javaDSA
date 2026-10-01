import { useState } from "react";

function Counter(){
    const [count,setCount]=useState(0)
    function incrementCount(){
        setCount(count-1)
    }
   return(
    <div>
        <button onClick={incrementCount}>Click Me</button>
        <p>Count={count}</p>
    </div>
   )
}
export default Counter;