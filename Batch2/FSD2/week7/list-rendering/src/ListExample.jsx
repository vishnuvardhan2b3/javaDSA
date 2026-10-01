function ListExample(){
    const people=[
        {name:"vijay",role:"Developer",city:"Nellore"},
        {name:"Ajay",role:"Tester",city:"Banglore"},
        {name:"Ravi",role:"Manager",city:"Hyderabad"}
                
]
  return (
    <div>
        {people.map(person=>{
            return (
            <div>
                <h2>{person.name}</h2>
                <p>{person.role}</p>
                <p>{person.city}</p>
            </div>
            )
            
        })}
    </div>
  )
}
export default ListExample;