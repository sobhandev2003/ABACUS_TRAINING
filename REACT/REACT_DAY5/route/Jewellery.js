import React from 'react'

function Jewellery() {
  return (
    <div>
      <h2>JEWELLERY</h2>
      <img src="data:image/jpeg;base64,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"
        height="200px" width="200px" alt="NO IMAGE"/>
    </div>
  )
}

export default Jewellery