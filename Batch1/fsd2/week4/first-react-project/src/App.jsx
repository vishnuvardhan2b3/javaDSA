import "./App.css"
import {Product} from "./Product.jsx"
function App()
{
  return <div> 
            <Product name="mobile" price={20000} url="https://5.imimg.com/data5/SELLER/Default/2022/5/FZ/AR/OQ/138319557/redmi-note-7-4gb-64gb-mobile-phone-500x500.jpg"/>
            <Product name="laptop" price={50000}/>
        </div>
}
export default App;