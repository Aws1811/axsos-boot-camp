import { useState } from "react";

function Form() {
    // const [firstName, setFirstName] = useState("");
    // const [lastName, setLastName] = useState("");
    // const [email, setEmail] = useState("");
    // const [password, setPassword] = useState("");
    // const [confirmPassword, setConfirmPassword] = useState("");
    // const [errors,setErrors] = useState("");
    const [data, setData] = useState({
        firstName: "",
        lastName: "",
        email: "",
        password: "",
        confirmPassword: "",
    });

    const [errors, setErrors] = useState({
        firstName: "",
        lastName: "",
        email: "",
        password: "",
        confirmPassword: "",
    });

    const hundleErrorsFirstName = (e) => {
        setData({...data , firstName:e.target.value });

        if (e.target.value.length === 0 ) {
            setErrors({ ...errors,firstName:""});
        } else if (e.target.value.length < 3){
            setErrors({...errors,firstName:"the first name must be more than 2 charcters"});
        }else{
            setErrors({...errors,firstName:""})
        }
    };

    const hundleErrorsLastName = (e) => {
        setData({...data,lastName:e.target.value});

        if(e.target.value.length === 0 ){
            setErrors({...errors,lastName:""})
        }else if(e.target.value.length <3){
            setErrors({...errors,lastName:"the last name must be more than 2 charcters"});
        }else{
            setErrors({...errors,lastName:""})
        }
    };

      const hundleErrorsEmail = (e) => {
        setData({...data,email:e.target.value});

        if(e.target.value.length === 0 ){
            setErrors({...errors,email:""})
        }else if(e.target.value.length <6){
            setErrors({...errors,email:"the email must be more than 6 charcters"});
        }else{
            setErrors({...errors,email:""})
        }
    };

      const hundleErrorsPassword = (e) => {
        setData({...data,password:e.target.value});

        if(e.target.value.length === 0 ){
            setErrors({...errors,password:""})
        }else if(e.target.value.length <8){
            setErrors({...errors,password:"the password must be more than 8 charcters"});
        }else{
            setErrors({...errors,password:""})
        }
    };

      const hundleErrorsConfirmPassword = (e) => {
        setData({...data,confirmPassword:e.target.value});

        if(e.target.value.length === 0 ){
            setErrors({...errors,confirmPassword:""})
        }else if(e.target.value.length <8){
            setErrors({...errors,confirmPassword:"the confirm Password must be more than 8 charcters"});
        }else{
            setErrors({...errors,confirmPassword:""})
        }
    };


    return (
        <>
            <form>
                <section>
                    <div>
                        <label>
                            First Name:
                            {errors.firstName ? <h3>{errors.firstName}</h3> : <></>}
                        </label>
                        <input
                            type="text"
                            value={data.firstName}
                            onChange={hundleErrorsFirstName}
                        />
                    </div>
                    <div>
                        <label>
                            Last Name:
                            {errors.lastName ? <h3>{errors.lastName}</h3>:<></>}
                        </label>

                        <input
                            type="text"
                            value={data.lastName}
                            onChange={hundleErrorsLastName}
                        />
                    </div>
                </section>
                <div>
                    <label>
                        Email:
                            {errors.email ? <h3>{errors.email}</h3>:<></>}
                    </label>
                    <input
                        type="email"
                        value={data.email}
                        onChange={hundleErrorsEmail}
                    />
                </div>
                <section>
                    <div>
                        <label>
                            Password
                            {errors.password ? <h3>{errors.password}</h3>:<></>}
                        </label>
                        <input
                            type="password"
                            value={data.password}
                            onChange={hundleErrorsPassword}
                        />
                    </div>
                    <div>
                        <label>
                            Confirm Password:
                            {errors.confirmPassword ? <h3>{errors.confirmPassword}</h3>:<></>}

                        </label>
                        <input
                            type="password"
                            value={data.confirmPassword}
                            onChange={hundleErrorsConfirmPassword}
                        />
                    </div>
                </section>
            </form>
            <section className="section">
                <p> the First Name :- {data.firstName}</p>
                <p> the Last Name :- {data.lastName}</p>
                <p> Email is :- {data.email}</p>
                <p> Password is :- {data.password}</p>
                <p>Confirm Password is :- {data.confirmPassword}</p>
            </section>
        </>
    );
}
export default Form;
