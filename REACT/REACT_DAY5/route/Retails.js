import React from 'react'

function Retails() {
  return (
    <div>
        <h2>REATILS SECTION</h2>
      <img src="data:image/jpeg;base64,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"
      width="200px" height="200px" alt="NO IMAGE"/>
    </div>
  )
}

export default Retails