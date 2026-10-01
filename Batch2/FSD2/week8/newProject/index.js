const express=require("express")
const app=express()
let port=3000
app.listen(port,()=>{
    console.log(`app listening on port ${port}`);
})
/*app.use((req,res)=>{
    console.log("request received");
    res.send("<h1>hello</h1>");
})*/
app.get('/',(req,res)=>{
    res.send("You contacted root path")
})
app.get('/apple',(req,res)=>{
    res.send("You contacted apple path")
})
app.get('/orange',(req,res)=>{
    res.send("You contacted orange path")
})
app.get(/.*/,(req,res)=>{
    res.send("This page does not exist")
})
