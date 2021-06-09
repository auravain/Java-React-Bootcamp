import React from 'react';
import { Dropdown, Image, Menu } from 'semantic-ui-react';

export default function SignedIn({ signOut }) {
	return (
		<div>
			<Menu.Item>
				<Image
					avatar
					spaced="right"
					src="https://avatars.githubusercontent.com/u/74612421?s=400&u=ea316b46f73477e92dbb5e67c38f074b5c561ece&v=4"
				/>
				<Dropdown pointing="top left" text="İlknur">
					<Dropdown.Menu>
						<Dropdown.Item text="Bilgilerim" icon="info" />
						<Dropdown.Item onClick={signOut} text="Çıkış Yap" icon="sign-out" />
					</Dropdown.Menu>
				</Dropdown>
			</Menu.Item>
		</div>
	);
}
