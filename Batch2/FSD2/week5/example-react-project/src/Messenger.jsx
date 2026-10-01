function Messenger({name,isOnline,isPremium}){
      

      return <div>
                <h1>{name}</h1>
                {isPremium && <span>⭐</span>}
                <p>{isOnline?"Online🟢":"Offline🔴"}</p>
                <p>{isOnline?"Available for chat":"Not available for Chat"}</p>
                {isOnline?<button>Send Message</button>:<small>Check back later</small>}
            </div>
}
export default Messenger;