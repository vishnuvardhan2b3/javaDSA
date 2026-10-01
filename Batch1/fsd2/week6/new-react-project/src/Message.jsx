function Message({name,isOnline,isPremium}){
    
        return(
            <div>
                <h3>{name}
                    {isPremium && <span>⭐</span>}
                </h3>
                <span>{isOnline?"🟢Online":"🔴Offline"}</span>
                <p>{isOnline?"Ready to message":"Not Available"}</p>
                {isOnline?
                <button>Send Message</button>:
                <small>Check back later</small>
                }
            </div>
        )
   

}
export default Message;