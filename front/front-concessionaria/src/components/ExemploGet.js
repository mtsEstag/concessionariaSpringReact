import React, { useState, useEffect } from "react";
import axios from "axios";

function ExemploGet() {

    const [carros, setCar] = useState([]);

    useEffect(() => {
        axios.get("http://localhost:8080/Carros").then(result => {
            setCar(result.data);

        })
    }, []);

    return (
        <>
            {carros.map(car => (
                <div key={car.id}>
                    <img src={car.imagem} />
                    <p>{car.modelo}</p>
                </div>
            ))}
        </>
    )
}

export default ExemploGet;
