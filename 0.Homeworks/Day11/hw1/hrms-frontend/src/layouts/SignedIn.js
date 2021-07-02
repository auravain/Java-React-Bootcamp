import React from 'react';
import { Dropdown } from 'semantic-ui-react';

export default function SignedIn({ signOut }) {
	return (
		<div style={{ position: 'fixed', right: 50, marginTop: -10 }}>
			<Dropdown>
				<Dropdown.Item icon="info">Bilgilerim</Dropdown.Item>
				<Dropdown.Item icon="info">Başvurularım</Dropdown.Item>
				<Dropdown.Item icon="info">İlanlar</Dropdown.Item>
				<Dropdown.Item onClick={signOut} icon="sign-out">
					Sign Out
				</Dropdown.Item>
			</Dropdown>
		</div>
	);
}
