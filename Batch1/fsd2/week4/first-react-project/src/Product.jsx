export const Product=(props)=>{
    return <div>
        <h1>I am a {props.name}</h1>
        <p>my price is Rs.{props.price}</p>
        <img src={props.url}/>
    </div>
}
