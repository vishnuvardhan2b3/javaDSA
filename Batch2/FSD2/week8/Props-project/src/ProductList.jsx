export const ProductList=()=>{
    let products=[
        {
            id:1,
            name:"Mobile",
            price:50000
        },
        {
            id:2,
            name:"Laptop",
            price:100000
        },
        {
            id:3,
            name:"Tablet",
            price:75000
        }]
    return(
        
           products.map((product)=>{
            return(
                 <div>
                    <h3>{product.name}</h3>
                    <p>{product.price}</p>
                 </div>
            )
           })       
    )
}