import React from 'react';

export default function SideNavigation () {
return (
    <div style={{ width: '170px', backgroundColor: '#add8e6', padding: '20px', height: '100vh' }}>
      <h3><a href = "./home" style={{textDecoration: 'none'}} >Home</a></h3>
      <h3><a href = "./userManagement" style={{textDecoration: 'none'}} >User Management</a></h3>
      <h3><a href = "./eventManagement" style={{textDecoration: 'none'}} >Event Management</a></h3>
      <h3><a href = "./donationManagement" style={{textDecoration: 'none'}} >Donation Management</a></h3>
      <h3><a href = "./userView" style={{textDecoration: 'none'}} >User view</a></h3>
    </div>
)
}   
    
    
