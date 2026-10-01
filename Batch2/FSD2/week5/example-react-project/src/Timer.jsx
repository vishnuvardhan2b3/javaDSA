import { useEffect, useState } from "react"

function Timer(){
    const [seconds,setSeconds]=useState(0)
    useEffect(()=>{
        const inte=setInterval(()=>{
           setSeconds(prev=>prev+1)
        },1000)
          },[])

    return( 
    <div>
        <h1>Seconds: {seconds}</h1>
    </div>
    )
}
export default Timer