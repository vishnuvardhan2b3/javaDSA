console.log("Hello CSE A&B students")
const btn=document.getElementsByTagName("button");
btn[0].addEventListener("click",()=>{
    const head=document.getElementById("header2");
    head.textContent="Event listener";
});