import React from 'react';
import { Link } from 'react-router-dom';
import { Menu, Button } from 'semantic-ui-react';

export default function SignedOut({ signIn }) {
	return (
		<>
			<Link to={'sign-in'}>
				<Menu.Item style={{ margin: 5 }}>
					<Button onClick={signIn}>Sign In</Button>
				</Menu.Item>
			</Link>

			<Link to={'sign-up'}>
				<Menu.Item style={{ margin: 5 }} className="nav-item">
					<Button>Sign Up</Button>
				</Menu.Item>
			</Link>
		</>
	);
}
