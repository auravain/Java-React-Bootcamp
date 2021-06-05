import './App.css';
import Dashboard from './layouts/Dashboard';
import { Container } from 'semantic-ui-react';
import 'semantic-ui-css/semantic.min.css';
import Navi from './layouts/Navi';

function App() {
	return (
		<div className="App">
			<Navi />
			<Container className="main">
				<Dashboard />
			</Container>
		</div>
	);
}

export default App;
