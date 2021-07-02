import React from 'react';
import { Grid } from 'semantic-ui-react';
import { Route } from 'react-router';
import JobPosts from '../pages/JobPosts';
import Sidebar from './Sidebar';
import Footer from './Footer';
import Employers from '../pages/Employers';
import Candidates from '../pages/Candidates';

export default function Dashboard() {
	return (
		<div>
			<Grid>
				<Grid.Row>
					<Grid.Column width={2}>
						<Sidebar />
					</Grid.Column>
					<Grid.Column width={14}>
						<Candidates />
						<Employers />
						<JobPosts />
						<Route exact path="/" component={JobPosts} />
						<Route exact path="/employers" component={Employers} />
						<Route exact path="/candidates" component={Candidates} />
					</Grid.Column>
					<Footer />
				</Grid.Row>
			</Grid>
		</div>
	);
}
