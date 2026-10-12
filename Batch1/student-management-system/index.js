const express=require('express')
const app=express()
app.use(express.json())
let students=[
    {id:101,name:"vijay",age:18,course:'python'},
    {id:102,name:"ramu",age:22,course:"java"}
]
app.get('/students',(req,res)=>{

     res.send(students)
})
app.get('/student/:id',(req,res)=>{
    const id=req.params.id;
    const student=students.find(student=>student.id==id)
    console.log(!student)
    if(!student){
        res.status(404).json({
            message:`student with given ${id} id is not found`
        })
    }
    res.json(student)
})
app.post('/student',(req,res)=>{
    const student=req.body

    res.json(student)
})
app.listen(3000,()=>{
    console.log("Server started and running on port no 3000");
})