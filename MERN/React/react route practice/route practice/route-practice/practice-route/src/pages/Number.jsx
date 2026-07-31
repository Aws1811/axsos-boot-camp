import { useParams } from "react-router-dom";

const Number=()=>{
    const ramez = useParams(""); 
    return(
        <h1> the Number is  {ramez.id} </h1>
    )
}

export default Number;