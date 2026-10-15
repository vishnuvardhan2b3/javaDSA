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
app.get('/students/course',(req,res)=>{
    const {course}=req.query;
    const filteredStudents=students.filter(student=>student.course===course);
    console.log(filteredStudents);
    if(!filteredStudents){
        res.status(400).json({
            message:"student with the given course were not available"
        })
    }
    res.status(200).json(filteredStudents);
})
app.post('/student',(req,res)=>{
    const {name,course}=req.body;
    if(!name){
        res.status(400).json({message:"Title is required"})
    }
    if(!course){
        res.status(400).json({message:"Course is Required"})
    }
    const newStudent={
        id:Math.max(...students.map(student=>student.id))+1,
        name,
        course
    };
    students.push(newStudent);
    res.status(200).json(newStudent);
})
app.listen(3000,()=>{
    console.log("Server started and running on port no 3000");
})