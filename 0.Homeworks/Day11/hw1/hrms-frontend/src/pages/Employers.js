import React, { useEffect, useState } from 'react';
import { Icon, Table, Header } from 'semantic-ui-react';
import EmployerService from '../services/employerService';

export default function Employers() {
	const [employers, setEmployers] = useState([]);

	useEffect(() => {
		let employerService = new EmployerService();
		employerService.getAllEmployers().then((result) => setEmployers(result.data.data));
	}, []);

	return (
		<div>
			<Header as="h1">
				<Icon name="building outline" color="blue" />
				<Header.Content> Employers </Header.Content>
			</Header>
			<Table celled textAlign="center">
				<Table.Header>
					<Table.Row>
						<Table.HeaderCell>Company Name</Table.HeaderCell>
						<Table.HeaderCell>Website</Table.HeaderCell>
						<Table.HeaderCell>Phone</Table.HeaderCell>
						<Table.HeaderCell>Email</Table.HeaderCell>
					</Table.Row>
				</Table.Header>

				<Table.Body>
					{employers.map((employer) => (
						<Table.Row key={employer.id}>
							<Table.Cell>{employer.companyName}</Table.Cell>
							<Table.Cell>{employer.website}</Table.Cell>
							<Table.Cell>{employer.phone}</Table.Cell>
							<Table.Cell>{employer.email}</Table.Cell>
						</Table.Row>
					))}
				</Table.Body>
			</Table>
		</div>
	);
}
