import React from 'react';
import {BrowserRouter, Switch, Route} from 'react-router-dom';
import Home from './Pages/Home';
import List from './Pages/List';

const Routes = () => (
    <BrowserRouter>
        <Switch>
            <Route path="/" exact>
                <Home/>
            </Route>
            <Route path="/List">
                <List />
            </Route>
        </Switch>
    </BrowserRouter>
);

export default Routes;