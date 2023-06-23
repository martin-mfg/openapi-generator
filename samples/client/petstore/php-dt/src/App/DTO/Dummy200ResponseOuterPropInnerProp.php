<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Dummy200ResponseOuterPropInnerProp
{
    /**
     * @DTA\Data(field="myBool", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $my_bool;

}
