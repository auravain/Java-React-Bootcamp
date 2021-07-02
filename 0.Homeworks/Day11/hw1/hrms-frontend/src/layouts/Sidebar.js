import React from 'react';
import { Menu, Icon } from 'semantic-ui-react';

export default function Sidebar() {
	return (
		<div>
			<Menu icon="labeled" vertical>
				<Menu.Item name="candidates" to="/candidates">
					<Icon name="users" /> Candidates
				</Menu.Item>

				<Menu.Item name="employers" to="/employers">
					<Icon name="building outline" /> Employers
				</Menu.Item>
				<Menu.Item name="jobposts" to="/jobPosts">
					<Icon name="list" /> Job Posts
				</Menu.Item>
			</Menu>
		</div>
	);
}
