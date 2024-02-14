import React from 'react';
import { BrowserRouter as Router, Route, Routes  } from 'react-router-dom';
import Login from './login';
export default function Routing(){
    return (
        <Router>
            <Routes>
                    <Route path="/" element={<Login />} />
            </Routes>
        </Router>

    );
}