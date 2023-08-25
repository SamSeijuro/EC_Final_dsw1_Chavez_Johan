const React = require('react');
const ReactDOM = require('react-dom');
const {createBrowserRouter, RouterProvider} = require('react-router-dom');

const HomePage = require('./pages/home');
const NuevoVentaPage = require('./pages/nuevo-venta');
const VerProductoPage = require('./pages/ver-producto');
const NuevoProductoPage = require('./pages/nuevo-producto');
const VerVentaPage = require('./pages/ver-venta');
const EditarProductoPage = require('./pages/editar-producto');
const NuevoVentaDetallePage = require('./pages/nuevo-ventadetalle');


const router = createBrowserRouter([
	{ path: '/', element: <HomePage /> },
	{ path: '/ver-producto/:id', element: <VerProductoPage /> },
	{ path: '/nuevo-producto/', element: <NuevoProductoPage /> },
	{ path: '/ver-venta/:id', element: <VerVentaPage /> },
	{ path: '/nuevo-venta', element: <NuevoVentaPage /> },
	{ path: '/editar-producto/:id', element: <EditarProductoPage /> },
	{ path: '/ver-venta/:id/nuevo-ventadetalle', element: <NuevoVentaDetallePage /> },
])


ReactDOM.render(
	<React.StrictMode>
		<RouterProvider router={router} />
	</React.StrictMode>,
	document.getElementById('react'))
