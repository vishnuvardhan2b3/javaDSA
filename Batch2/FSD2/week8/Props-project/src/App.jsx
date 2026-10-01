import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import { UserCard } from './UserCard'
import { CardWrapper } from './CardWrapper'
import { UserDetails } from './UserDetails'
import { ProductList } from './ProductList'

function App() {
  
  return (
    <>
      <ProductList/>
      <UserDetails name="vishnu" isOnline={true} hideOffline={false} isPremium={true} isNewUser={true}/>
      <UserDetails name="vamsi" isOnline={false} hideOffline={true}/>
      <CardWrapper title="guest items">
        <p>Hi Guest</p>
        <p>Hi Guest</p>
        <p>Hi Guest</p>
      </CardWrapper>
      <UserCard id={1} name="vishnu" age={35} city="Nellore" email="vishnu@gmail.com"/>
    </>
  )
}

export default App
