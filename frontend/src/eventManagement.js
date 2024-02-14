import React from 'react';
import SideNavigation from './sideNavigation';
export default function EventManagement(){
  return (
  <div>
    <div style={{ backgroundColor: '#333', color: '#fff', padding: '2px' }}>
     <h3> <a>NGO Event Management 
     <a href = "/" style ={{'float': 'right', 'color': 'white', textDecoration: 'none'}}>Logout</a>
      </a></h3>
    </div>
	<SideNavigation />
    </div>
  );
}