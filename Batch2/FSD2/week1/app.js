console.log("Hello CSE E&F Students")
const btn=document.getElementsByTagName("button");
btn[0].addEventListener("click",()=>{
    const head=document.getElementById("header2");
    head.textContent="Event Listeners";
})