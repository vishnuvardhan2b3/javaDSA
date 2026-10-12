const express=require('express')
const app=express()
app.get('/',(req,res)=>{
    res.send("hello Express")
})
app.get('/about',(req,res)=>{
    res.send("Your viewing About Page")
})
app.get('/profile',(req,res)=>{
   
   res.send(`
    <h1>Hello</h1>
    <p>world</p>`   )
})
app.post('/profile',(req,res)=>{
    res.send("Added content in Profile Page")
})
app.put('/profile',(req,res)=>{
    res.send("updated Profile Page")
})
app.delete('/profile',(req,res)=>{
    res.send("Your Deleting content in Profile Page")
})
app.listen(3000,()=>{
    console.log("server started");
})