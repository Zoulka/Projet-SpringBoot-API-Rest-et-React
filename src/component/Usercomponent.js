import React from "react"
import Userservice from '../service/Userservice';


class Usercomponent extends React.Component{
 constructor(props) {
       super(props);
     this.state = {
            users:[]
        }
    }
   componentDidMount() {
     Userservice.getUsers().then((response) => {
           this.setState({users: response.data})
       });
   }

    render() {
        return(
            <div>
                <h1 className='text-center'> Users List</h1>
                <table className="table table-striped">
                    <thead>
                    <tr>
                        <td> User Id</td>
                        <td>User Nom</td>
                        <td>User Prénom</td>
                        <td>User Email </td>
                    </tr>
                    </thead>
                    <tbody>
                    {
                        this.state.users.map(
                            user =>
                                <tr key= {user.id}>
                                    <td> {user.id}</td>
                                    <td>{user.nom}</td>
                                    <td>{user.prenom}</td>
                                    <td>{user.email}</td>
                                </tr>
                        )
                    }
                    </tbody>

                </table>

            </div>
        )
   }
}

export default Usercomponent