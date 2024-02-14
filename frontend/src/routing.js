import React from 'react';
import { BrowserRouter as Router, Route, Routes  } from 'react-router-dom';
import Login from './login';
import Home from './home';
import UserManagement from './userManagement';
import EventManagement from './eventManagement';
import DonationManagement from './donationManagement';
import UserView from './userView';
export default function Routing(){
    return (
        <Router>
            <Routes>
                    <Route path="/" element={<Login />} />
                    <Route path="/home" element={<Home />} />
                    <Route path="/userManagement" element={<UserManagement />} />
                    <Route path="/eventManagement" element={<EventManagement />} />
                    <Route path="/donationManagement" element={<DonationManagement />} />
                    <Route path="/userView" element={<UserView />} />
            </Routes>
        </Router>

    );
}