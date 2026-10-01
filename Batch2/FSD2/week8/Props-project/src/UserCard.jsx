import { UserInfo } from "./UserInfo"

export const UserCard=({id,...props})=>{
    return(
        <div>
            <h1>User {id}🎉 details</h1>
            <UserInfo {...props}/>
        </div>
    )
}