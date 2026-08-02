import React, { useState } from 'react';

const PersonCard = (props) => {
  const { firstName, lastName, defaultAge,hairColor } = props;
  const [age,setAge] = useState(props.age);

const increaseAge = ()=>{
  if (age>=90){
    alert("you are dead")
    setAge(defaultAge)
  }else{
    setAge(age+1)
  }
  };

  return (
    <div>
      <h2>{lastName}, {firstName}</h2>
      <p>Age: {age}</p>
      <p>Hair Color: {hairColor}</p>
      <button onClick={increaseAge}> old the person </button>
    </div>

  );
}



export default PersonCard;

