import React, { useState } from 'react';
import { Container, Menu, Icon } from 'semantic-ui-react';
import { useHistory } from 'react-router';
import { NavLink } from 'react-router-dom';
import SignedOut from './SignedOut';
import SignedIn from './SignedIn';

export default function Navi() {
	const [isAuthenticated, setIsAuthenticated] = useState(false);

	const history = useHistory();

	function handleSignOut() {
		setIsAuthenticated(false);
		history.push('/');
	}

	function handleSignIn() {
		setIsAuthenticated(true);
	}
	return (
		<div>
			<Menu fixed="top" size="large">
				<Container>
					<Menu.Item as={NavLink} to="/home">
						<Icon name="home" color="blue" /> Home
					</Menu.Item>
					<Menu.Item as={NavLink} to="/">
						<Icon name="building" color="blue" /> Employers
					</Menu.Item>
					<Menu.Item as={NavLink} to="/">
						<Icon name="users" color="blue" /> Candidates
					</Menu.Item>
					<Menu.Menu position="right">
						{isAuthenticated ? (
							<SignedIn signOut={handleSignOut} />
						) : (
							<SignedOut signIn={handleSignIn} />
						)}
					</Menu.Menu>
				</Container>
			</Menu>
		</div>
	);
}
