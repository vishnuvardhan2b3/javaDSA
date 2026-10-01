export const UserDetails=({name,isOnline,hideOffline,isPremium,isNewUser})=>{
    if(hideOffline && !isOnline){
        return null;
    }
    
    return(
        <div>
            <h3>
                {name}
                {isNewUser && <span>🎉</span>}
                {isPremium && <span>⭐💫</span>}
            </h3>
            <span>{isOnline?"🟢Online":"Offline"}</span>
            <p>{isOnline?"Available for chat":"Not available for chat"}</p>
            {
                isOnline?<button>Send Message</button>:<small>check bak later</small>
            }
            
        </div>
    )
}