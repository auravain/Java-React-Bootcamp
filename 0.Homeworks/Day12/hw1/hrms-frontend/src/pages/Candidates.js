import React, { useEffect, useState } from 'react';
import CandidateService from '../services/candidateService';
import { Icon, Table, Header } from 'semantic-ui-react';

export default function Candidates() {
	const [candidates, setCandidates] = useState([]);

	useEffect(() => {
		let candidateService = new CandidateService();
		candidateService.getAllCandidates().then((result) => setCandidates(result.data.data));
	}, []);
	return (
		<div>
			<Header as="h1">
				<Icon name="users" color="blue" />
				<Header.Content> Candidates </Header.Content>
			</Header>
			<Table celled textAlign="center">
				<Table.Header>
					<Table.Row>
						<Table.HeaderCell>First Name</Table.HeaderCell>
						<Table.HeaderCell>Last Name</Table.HeaderCell>
						<Table.HeaderCell>Email</Table.HeaderCell>
						<Table.HeaderCell>Birth Date</Table.HeaderCell>
					</Table.Row>
				</Table.Header>

				<Table.Body>
					{candidates.map((candidate) => (
						<Table.Row key={candidate.id}>
							<Table.Cell>{candidate.firstName}</Table.Cell>
							<Table.Cell>{candidate.lastName}</Table.Cell>
							<Table.Cell>{candidate.email}</Table.Cell>
							<Table.Cell>{candidate.birthYear}</Table.Cell>
						</Table.Row>
					))}
				</Table.Body>
			</Table>
		</div>
	);
}
