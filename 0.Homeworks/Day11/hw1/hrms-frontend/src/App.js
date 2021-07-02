import { Container } from 'semantic-ui-react';
import './styles/App.css';
import 'semantic-ui-css/semantic.min.css';
import Dashboard from './layouts/Dashboard';
import Navi from './layouts/Navi';

function App() {
	return (
		<div className="App">
			<Navi />
			<Container className="main" style={{ marginTop: 100 }}>
				<Dashboard />
			</Container>
		</div>
	);
}

export default App;
