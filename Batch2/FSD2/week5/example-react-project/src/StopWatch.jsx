import { useState } from "react"
import Timer from "./Timer"

function StopWatch(){
    const [show,setShow]=useState(false)

    return (
        <div>
            <button onClick={()=>{setShow(!show)}}>Show</button>
            {
                show && <Timer/>
            }
        </div>
    )
}
export default StopWatch