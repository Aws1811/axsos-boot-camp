import { useParams } from "react-router-dom";

const Word=()=>{
    const hosni = useParams(""); 
    console.log("why im here :" + hosni)
    return(
        <h1> the word is  {hosni.word} </h1>
        
    )
}

export default Word;