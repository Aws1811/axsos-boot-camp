import { useParams } from "react-router-dom";

const Color=()=>{
    const aws = useParams(); 
    return(
        <h1 style={{backgroundColor:aws.background ,color:aws.color}}> the word is  {aws.word1} </h1>
    )
}

export default Color;