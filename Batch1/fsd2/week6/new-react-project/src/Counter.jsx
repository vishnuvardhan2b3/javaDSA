import { useEffect, useState } from "react";

function Counter(){
    const [count,setCount]=useState(0)
    const [data,setData]=useState(0)

    function handleClick(){
        setCount(count+1)
        console.log(`count ${count}`)
    }
    function handleClickData(){
        setData(data+1)
        console.log(`data ${data}`)
    }
    useEffect(()=>{
        setTimeout(()=>{console.log("hello")},5000)
    },[count])
    return(
        <div>
            <p>count:{count}</p>
            <p>data:{data}</p>
            <button onClick={handleClick}> click</button>
            <button onClick={handleClickData}> click Data</button>
        </div>
    )
}
export default Counter;