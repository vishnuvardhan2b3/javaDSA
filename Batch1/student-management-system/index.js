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
    if(filteredStudents.length==0){
        return res.status(400).json({
            message:"student with the given course were not available"
        })
    }
    return res.status(200).json(filteredStudents);
})
app.get('/students/age',(req,res)=>{
   const {age}=req.query;
   const numberAge=Number(age);
   const filteredStudents=students.filter(student=>student.age>numberAge);
   if(filteredStudents.length==0){
    return res.status(400).json({
        message:"Students with given age is not found"
    })
   }
   return res.status(200).json(filteredStudents)
})
app.patch('/student/:id',(req,res)=>{
    const id=req.params.id;
    const age=Number(req.body.age);
    const student=students.find(student=>student.id==id)
    console.log(!student)
    if(!student){
        res.status(404).json({
            message:`student with given ${id} id is not found`
        })
    }
    student.age=age;
    res.status(200).json(student)
})
app.delete('/student/:id',(req,res)=>{
    const id=Number(req.params.id);
    const index=students.findIndex(students=>students.id===id);
    console.log(index);
    if(index==-1){
        return res.status(400).json({
            message:"The student with given id is not found"
        })
    }
    students.splice(index,1);
    res.json({
        message:"Deleted success"
    })
})
app.put('/student/:id',(req,res)=>{
    const id=Number(req.params.id);
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
    const student=students.find(student=>student.id==id)
    if(!student){
        res.status(404).json({
            message:`student with given ${id} id is not found`
        })
    }
    student.name=name;
    student.age=age;
    student.course=course;
    return res.status(200).json(student);

})
app.post('/student',(req,res)=>{
    const {name,age,course}=req.body;
    if(!name){
        res.status(400).json({message:"Title is required"})
    }
    if(!course){
        res.status(400).json({message:"Course is Required"})
    }
    if(!age){
        res.status(400).json({message:"Age is required"})
    }
    const newStudent={
        id:Math.max(...students.map(student=>student.id))+1,
        name,
        age,
        course
    };
    students.push(newStudent);
    res.status(200).json(newStudent);
})
app.listen(3000,()=>{
    console.log("Server started and running on port no 3000");
})