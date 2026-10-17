const express=require("express")
const app=express()
app.use(express.json());
const students=[
    {id:101,name:"vijay",age:18,course:"python"},
    {id:102,name:"Rajiv",age:28,course:"java"},
    {id:103,name:"Sameer",age:20,course:"python"},
    {id:104,name:"Abeed",age:24,course:"java"}
]
app.get("/",(req,res)=>{
    res.send("Hello world");
})
app.get("/students",(req,res)=>{
    return res.status(200).json(students);
})
app.get("/student/:id",(req,res)=>{
    const id=Number(req.params.id);
    const student=students.find(student=>student.id===id);
    if(!student){
        return res.status(404).json({
            message:"student not found"
        }
        );
    }
    res.status(200).json(student);
})
app.get("/students/course",(req,res)=>{
    const {course}=req.query;
    const filteredStudents=students.filter(student=>student.course===course);
    return res.status(200).json(filteredStudents);
})
app.put('/',(req,res)=>{
    res.send("Updated successfully");
})
app.post("/student",(req,res)=>{
    const {name,age,course}=req.body;
    if(!name){
        return res.status(400).json({
            message:"Name is required"
        })
    }
    if(!age){
        return res.status(400).json({
            message:"age is required"
        })
    }
    if(!course){
        return res.status(400).json({
            message:"Course is required"
        })
    }
    const newStudent={
        id:Math.max(...students.map(student=>student.id))+1,
        name,
        age,
        course
    }
    students.push(newStudent);
    return res.status(200).json(newStudent)
})
app.delete("/",(req,res)=>{
    res.send("Deleted Successfully");
})
app.listen(3000,()=>{
    console.log("Server Started and listening on port number 3000");
})
