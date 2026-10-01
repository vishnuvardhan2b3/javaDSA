import { useState } from "react";

function Pagination(){
    const arr=[
        'apple',
        'banana',
        'cherry',
        'dry fruits',
        'egg',
        'fish',
        'guva',
        'hunter',
    ]
    const [currentPage,setCurrentPage]=useState(1);
    const itemsPerPage=3;
    const startIndex=(currentPage-1)*itemsPerPage;
    const currentItems=arr.slice(startIndex,startIndex+itemsPerPage);
    const totalPages=Math.ceil(arr.length/itemsPerPage)
    console.log(currentItems);
    return(
        <div>
            <h2>Products</h2>
            {currentItems.map((item,index) =>(<ul key={index}>{item}</ul>))}
            <button
            onClick={()=>setCurrentPage(currentPage-1)}
            disabled={currentPage===1}>prev</button>
            {Array.from({length:totalPages},(_,index)=>(<button
            onClick={()=>setCurrentPage(index+1)}
            key={index}>{index+1}</button>))}
            <button
            onClick={()=>setCurrentPage(currentPage+1)}
            disabled={currentPage===totalPages}>next</button>
        </div>
    )

}
export default Pagination;