import UserInfo from "./UserInfo";

function UserCard(props){
    return(
        <div>
            <h1>User Details</h1>
            <UserInfo {...props} />
        </div>
    )
}

export default UserCard;